package de.florianisme.wakeonlan.ui.modify;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BroadcastHelper {

    private static final List<String> INTERFACE_LIST = Lists.newArrayList("wlan0", "eth0", "tun0");

    public final Optional<InetAddress> getBroadcastAddress() throws IOException {
        return Collections.list(getNetworkInterfaces()).stream()
                .filter(this::isAllowedInterfaceName)
                .map(NetworkInterface::getInterfaceAddresses)
                .flatMap(Collection::stream)
                .map(InterfaceAddress::getBroadcast)
                .filter(Objects::nonNull)
                .findFirst();
    }

    protected Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException {
        return NetworkInterface.getNetworkInterfaces();
    }

    private boolean isAllowedInterfaceName(NetworkInterface networkInterface) {
        return INTERFACE_LIST.contains(networkInterface.getName());
    }
}
