package de.florianisme.wakeonlan.persistence.models;

public class Device {

    public int id;

    public String name;

    public String macAddress;

    public String broadcastAddress;

    public int port;

    public String statusIp;

    public String secureOnPassword;

    public boolean remoteShutdownEnabled;

    public String sshAddress;

    public Integer sshPort;

    public String sshUsername;

    public String sshPassword;

    public String sshCommand;

    public Device(int id, String name, String macAddress, String broadcastAddress, int port, String statusIp, String secureOnPassword,
                  boolean remoteShutdownEnabled, String sshAddress, Integer sshPort, String sshUsername, String sshPassword, String sshCommand) {
        this.id = id;
        this.name = name;
        this.macAddress = macAddress;
        this.broadcastAddress = broadcastAddress;
        this.port = port;
        this.statusIp = statusIp;
        this.secureOnPassword = secureOnPassword;
        this.remoteShutdownEnabled = remoteShutdownEnabled;
        this.sshAddress = sshAddress;
        this.sshPort = sshPort;
        this.sshUsername = sshUsername;
        this.sshPassword = sshPassword;
        this.sshCommand = sshCommand;
    }


    public Device() {
    }
}
