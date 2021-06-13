package svyshe.com.github.libcommons.libweb;

public enum Port {
    NOT_ASSIGNED(0, "N/A", "Not assigned"),
    TCP_MUX(1, "TCPMUX", "TCP Port Service Multiplexer"),
    REMOTE_JOB_ENTRY(5, "Remote Job Entry", "Remote Job Entry"),
    ECHO_PROTOCOL(7, "Echo Protocol", "Echo Protocol"),
    DISCARD_PROTOCOL(9, "Discard Protocol / Wake-on-LAN", "Discard Protocol / Wake-on-LAN"),
    SYSSTAT_SERVICE(11, "sysstat", "Active Users (sysstat service)"),
    DAYTIME_PROTOCOL(13, "Daytime Protocol", "Daytime Protocol"),
    NETSTAT_OLD(15, "netstat service", "Previously netstat service"),
    QOTD(17, "QOTD", "Quote of the Day (QOTD)"),
    MSP(18, "MSP", "Message Send Protocol"),
    CHARGEN(19, "CHARGEN", "Character Generator Protocol (CHARGEN"),
    FTP_DATA(20, "FTP", "File Transfer Protocol (FTP) data transfer"),
    FTP_CONTROL(21, "FTP", "File Transfer Protocol (FTP) control command"),
    SSH(22, "SSH/SCP/SFTP", "Secure Shell (SSH), secure logins, file transfer (scp, sftp) and port forwarding"),
    TELNET(23, "Telnet", "Telnet protocol"),
    PRIV_MAIL_LMTP(24, "Priv-mail/LMTP", "Priv-mail / Local Mail Transport Protocol (LMTP)"),
    SMTP(25, "SMTP", "Simple Mail Transfer Protocol (SMTP)"),
    HA(28, "Palo Alto Networks HA", "Palo Alto Networks Panorama High Availability (HA) sync encrypted port"),
    RF(34, "RF", "Remote File (RF)"),
    PRIVATE_PRINTER(35, "Private Printer Protocols", "Private Printer Protocols"),
    TIME_PROTOCOL(37, "Time Protocol", "Time Protocol"),
    RLP(39, "RLP", "Resource Location Protocol"),
    GRAPHICS(41, "Graphics", "Graphics"),
    NAME_SERVICE(42, "Host Name Server Protocol/WINS", "ARPA Host Name Server Protocol / Windows Internet Name Service (WINS)"),
    WHOIS(43, "WHOIS", "WHOIS-Protocol"),
    NI_FTP(47, "NI FTP", "NI FTP"),
    TACACS(49, "TACACS", "TACACS Login Host Protocol"),
    RMCP(50, "RMCP", "Remote Mail Checking Protocol"),
    IMP_OLD(51, "IMP", "Interface Message Processor (IMC)"),
    XNS_TIME(52, "XNS Time Protocol", "XNS (Xerox Network Systems) Time Protocol"),
    DNS(53, "DNS", "Domain Name System (DNS)"),
    XNS_CLEARINGHOUSE(54, "XNS Clearinghouse", "XNS (Xerox Network Systems) Clearinghouse"),
    ISI_GL(55, "ISI-GL", "ISI Graphics Language"),
    RAP_XNS_AUTH(56, "RAP/XNS Authentication", "Route Access Protocol (RAP) / XNS (Xerox Network Systems) Authentication"),
    MTP(57, "MTP", "Mail Transfer Protocol (MTP"),
    XNS_MAIL(58, "XNS Mail", "XNS (Xerox Network Systems) Mail"),
    NIFTP(61, "NIFTP-Based Mail", "NIFTP-Based Mail protocol"),
    BOOTP_SERVER(67, "BOOTP Server", "Bootstrap Protocol (BOOTP) Server"),
    BOOTP_CLIENT(68, "BOOTP Client", "Bootstrap Protocol (BOOTP) Client"),
    TFTP(69, "TFTP", "Trivial File Transfer Protocol (TFTP)"),
    GOPHER(70, "Gopher", "Gopher-Protocol"),
    GENIUS_NETJRS(71, "Genius / NETJRS", "Genius Protocol / Remote Job Netry (NETJRS)"),
    NETJRS_1(72, "NETJRS", "Remote Job Entry (NETJRS)"),
    NETJRS_2(73, "NETJRS", "Remote Job Entry (NETJRS)"),
    NETJRS_3(74, "NETJRS", "Remote Job Entry (NETJRS)"),
    FINGER(79, "Finger", "Finger protocol"),
    HTTP(80, "HTTP", "Hypertext Transfer Protocol (HTTP)"),
    TORPARK_ONION_ROUTING(81, "TorPark onion routing", "TorPark onion routing"),
    TORPARK_ONION_CONTROL(82, "TorPark onion control", "TorPark onion control"),
    MIT_ML_DEVICE(83, "MIT ML Device", "MIT ML Device, networking file system"),
    KERBEROS(88, "Kerberos Auth", "Kerberos authentication system"),
    DNSIX_POINTCAST(90, "dnsix / Pointcast", "DoD Network Security for Information Exchange (dnsix) / PointCast"),
    SUPDUP(95, "SUPDUP", "SUPDUP terminal independent remote login"),
    WIP_MESSAGE(99, "WIP Message", "WIP Message");

    long number;
    String name;
    String longName;

    Port(long number, String name, String longName) {
        this.number = number;
        this.name = name;
        this.longName = longName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }
}
