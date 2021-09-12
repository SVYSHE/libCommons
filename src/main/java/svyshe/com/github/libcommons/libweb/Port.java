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
    NAME_SERVICE(42, "Host Name Server Protocol/WINS",
                 "ARPA Host Name Server Protocol / Windows Internet Name Service (WINS)"),
    WHOIS(43, "WHOIS", "WHOIS-Protocol"),
    NI_FTP(47, "NI FTP", "NI FTP"),
    TACACS(49, "TACACS", "TACACS Login Host Protocol"),
    RMCP(50, "RMCP", "Remote Mail Checking Protocol"),
    IMP_OLD(51, "IMP", "Interface Message Processor (IMC)"),
    XNS_TIME(52, "XNS Time Protocol", "XNS (Xerox Network Systems) Time Protocol"),
    DNS(53, "DNS", "Domain Name System (DNS)"),
    XNS_CLEARINGHOUSE(54, "XNS Clearinghouse", "XNS (Xerox Network Systems) Clearinghouse"),
    ISI_GL(55, "ISI-GL", "ISI Graphics Language"),
    RAP_XNS_AUTH(56, "RAP/XNS Authentication",
                 "Route Access Protocol (RAP) / XNS (Xerox Network Systems) Authentication"),
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
    WIP_MESSAGE(99, "WIP Message", "WIP Message"),
    NIC_HOST_NAME(101, "NIC host name", "NIC host name"),
    ISO_TSAP(102, "ISO-TSAP", "ISO Transport Service Access Point (TSAP)"),
    DICOM(104, "DICOM", "Digital Imaging and Communications in Medicine (DICOM)"),
    CCSO(105, "CCSO Nameserver", "CCSO Nameserver Protocol"),
    RTELNET(107, "RTelnet", "Remote User Telnet Service (RTelnet)"),
    IBM(108, "IBM SNA", "IBM Systems Network Architecture (IBM SNA)"),
    POP2(109, "POP2", "Post Office Protocol, version 2 (POP2)"),
    POP3(110, "POP3", "Post Office Protocol, version 3 (POP3)"),
    ONC_RPC(111, "ONC RPC", "Open Network Computing Remote Procedure Call (ONC RPC)"),
    IDENT_AUTH(113, "ident / auth", "ident / ex auth"),
    SFTP(115, "SFTP", "Simple File Transfer Protocol"),
    UUCP(117, "UUCP Path service", "UUCP Mapping Project (path service)"),
    SQL(118, "SQL", "SQL-Services"),
    NNTP(119, "NNTP", "Network News Transfer Protocol (NNTP)"),
    NTP(123, "NTP", "Network Time Protocol (NTP)"),
    UNISYS(126, "Unisys", "Unisys Unitary Login (Unisys)"),
    DCE_EPMAP(135, "DCE / Microsoft EPMAP", "DCE endpoint resolution / Microsoft End Point Mapper (EPMAP)"),
    NETBIOS_NAME_SERVICE(137, "NetBIOS Naame Service", "NetBIOS Naame Service"),
    NETBIOS_DATAGRAM_SERVICE(138, "NetBIOS Datagram Service", "NetBIOS Datagram Service"),
    NETBIOS_SESSION_SERVICE(139, "NetBIOS Session Service", "NetBIOS Session Service"),
    IMAP(143, "IMAP", "Internet Message Access Protocol (IMAP)"),
    JARGON(148, "jargon", "Jargon-Server"),
    BFTP(152, "BFTP", "Background File Transfer Program (BFTP)"),
    SGMP(153, "SGMP", "Simple Gateway Monitoring Protocol (SGMP)"),
    SQL_SERVICE(156, "SQL Service", "SQL Service"),
    DMSP(158, "DMSP", "Distributed Mail System Protocol (DMSP)"),
    SNMP(161, "SNMP", "Simple Network Management Procotol (SNMP)"),
    SNMP_TRAP(162, "SNMPTRAP", "Simple Network Management Procotol Trap (SNMPTRAP)"),
    POSTSCRIPT(170, "PostScript", "PostScript Print Server"),
    XDMCP(177, "XDMCP", "X Display Manager Control Protocol (XDMCP)"),
    BGP(179, "BGP", "Border Gateway Protocol (BGP)"),
    IRC(194, "IRC", "Internet Relay Chat (IRC)"),
    SMUX(199, "SMUX", "SNMP Unix Multiplexer (SMUX)"),
    APPLETALK(201, "AppleTalk", "AppleTalk Routing Maintenance"),
    QMTP(209, "QMTP", "Quick Mail Transfer Protocol"),
    ANSI_Z_39_50(210, "ANSI Z39.50", "ANSI Z39.50"),
    IPX(213, "IPX", "Internet Packet Exchange (IPX)"),
    MPP(218, "MPP", "Message Posting Protocol (MPP)"),
    IMAP_V3(220, "IMAP", "Internet Message Access Protocol (IMAP), version 3"),
    TWO_DEV_2SP(256, "2DEV 2SP Port", "2DEV 2SP Port"),
    ESRO(259, "ESRO", "Efficient Short Remote Operations (ESRO)"),
    ARCISDMS(262, "Arcisdms", "Arcisdms"),
    BGMP(264, "BGMP", "Border Gateway Multicast Procotol (BGMP)"),
    HTTP_MGMT(280, "http-mgmt", "http-mgmt"),
    THIN_LINC(300, "ThinLinc Web Access", "ThinLinc Web Access"),
    NOVASTOR(308, "Novastor Online Backup", "Novastor Online Backup"),
    APPLE_SHARE_ADMIN(311, "AppleShare IP Web administration", "AppleShare IP Web administration"),
    PKIX(318, "PKIX TSP", "PKIX Time Stamp Protocol (TSP)"),
    PTP_EVENT(319, "PTP event messages", "Precision Time Protocol (PTP) event messages"),
    PTP_GENERAL(320, "PTP general messages", "Precision Time Protocol (PTP) general messages"),
    IMMP(323, "IMMP", "Internet Message Mapping Protocol (IMMP)"),
    IT_MESSAGE_MESSAGE_EVENT(325, "IT-Message Message Event", "IT-Message Message Event"),
    IT_MESSAGE_STATUS_CONTROL(327, "IT-Message Status-Control Event", "IT-Message Status-Control Event"),
    IT_MESSAGE_GIF_EVENT(330, "IT-Message Gif Event", "IT-Message Gif Event"),
    MATIP_A(350, "MATIP (A)", "Mapping of Airline Traffic over Internet Protocol (MATIP) type A"),
    MATIP_B(351, "MATIP (B)", "Mapping of Airline Traffic over Internet Protocol (MATIP) type B"),
    CLOANTO_NET(356, "cloanto-net-1", "cloanto-net-1 (used by Cloanto Amiga Explorer and VMs"),
    ODMR(366, "ODMR", "On-Demand Mail Relay (ODMR)"),
    RPC2PORTMAP(369, "Rpc2portmap", "Rpc2portmap"),
    CODAAUTH2_SECURECAST1(370, "codaauth2 / securecast1",
                          "codaauth2, Coda authentication server / securecast1, outgoing packets to NAI's SecureCast servers as of 2000"),
    CLEARCASE_ALBD(371, "ClearCase albd", "ClearCase albd"),
    AMIGA(376, "Amiga Envoy Network Inquiry Protocol", "Amiga Envoy Network Inquiry Protcol"),
    HP_DATA_ALARM(383, "HP data alarm messenger", "HP data alarm messenger"),
    A_REMOTE_NETWORK_SERVER(384, "A Remote Network Server System", "A Remote Network Server System"),
    AURP(387, "AURP", "AppleTalk Update-base Routing Protocol (AURP)"),
    UNIDATA_LDM(388, "Unidata LDM", "Unidata LDM near real-time data distribution protocol"),
    LDAP(389, "LDAP", "Lightweight Directory Access Protocol (LDAP)"),
    DECNET(399, "DECnet+", "Digital Equipment Corporation DECnet+ (Phase V) over TCP/IP (RFC1859)"),
    UPS(401, "UPS", "Uninterruptable Power Supply (UPS)"),
    ALTIRIS(402, "Altiris", "Altiris Deployment Client"),
    DIRECT_CONNECT_HUB(411, "Direct Connect Hub", "Direct Connect Hub"),
    DIRECT_CONNECT_C2C(412, "Direct Connect Client-to-Client", "Direct Connect Client-to-Client"),
    SLP(427, "SLP", "Service Location Protocol (SLP)"),
    NNTP_2(433, "NNTP", "Network News Protocol (NNTP)"),
    MOBILE_IP(434, "Mobile IP Agent (RFC 5944)", "Mobile IP Agent (RFC 5944)"),
    HTTPS(443, "HTTPS", "Hypertext Transfer Protocol Secure (HTTPS)"),
    SNPP(444, "SNPP", "Simple Network Paging Protocol (SNPP)"),
    ACTIVE_DIRECTORY_SMB(445, "MS Active Directory / MS SMB",
                         "Microsoft-DS (Directory Services) Active Directory / SMB"),
    KERBERES_CHANGE_SET_PASSWORD(464, "Kerberos Change/Set password", "Kerberos Change/Set password"),
    URD_SMTPS_IGMPV3LITE(465, "URD / SMTPS / IGMP v3lite",
                         "URL Rendezvous Diretory for SSM (URD) / Simple Mail Transfer Protocol Secure (SMTPS) / IGMP over UDP for SSM (IGMP v3lite)"),
    TCPNETHASPSRV(475, "tcpnethaspsrv", "tcpnethaspsrv, Aladdin Knowledge Systems Hasp services"),
    CENTRO1(476, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO2(477, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO3(478, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO4(479, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO5(480, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO6(481, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO7(482, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO8(483, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO9(484, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTR010(485, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO11(486, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO12(487, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO13(488, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO14(489, "Centro Software ERP ports", "Centro Software ERP ports"),
    CENTRO15(490, "Centro Software ERP ports", "Centro Software ERP ports"),
    GO(491, "GO-Global", "GO-Global remote access and application publishing software"),
    RETROSPECT(497, "Retrospect", "Dantz Retrospect"),
    ISAKMP_IKE(500, "ISAKMP / IKE",
               "Internet Security Association and Key Management Protol (ISAKMP) / Internet Key Exchange (IKE)"),
    STMF(501, "SMTF", "Simple Transportation Management Framework (SMTF)"),
    MODBUS_ASA_APPL_PROTO(502, "Modbus / asa-appl-proto", "Modbus Protocol / asa-appl-proto Protocol"),
    CITADEL(504, "Citadel", "Citadel multiservice protocol for dedicated clients"),
    FCP(510, "FCP", "FirstClass Protocol (FCP)"),
    REXEC_COMSAT_BIFF(512, "Rexec / comsat / biff", "Remote Process Execution (Rexec) / comsat / biff"),
    WHO_RLOGIN(513, "Who / rlogin", "Who / rlogin"),
    RSH_SYSLOG(514, "rsh / Syslog", "Remote Shell (rsh) / Syslog"),
    LPD(515, "LPD", "Line Printer Daemon (LPD), print service");
    long number;
    String name;
    String longName;

    Port(long number, String name, String longName) {
        this.number = number;
        this.name = name;
        this.longName = longName;
    }
    
    public static Port getPort(int number)
    {
        switch (number)
        {
            case 0:
                return NOT_ASSIGNED;
            case 1:
                return TCP_MUX;
            case 5:
                return REMOTE_JOB_ENTRY;
            case 7:
                return ECHO_PROTOCOL;
            case 9:
                return DISCARD_PROTOCOL;
            case 11:
                return SYSSTAT_SERVICE;
            case 13:
                return DAYTIME_PROTOCOL;
            case 15:
                return NETSTAT_OLD;
            case 17:
                return QOTD;
            case 18:
                return MSP;
            case 19:
                return CHARGEN;
            case 20:
                return FTP_DATA;
            case 21:
                return FTP_CONTROL;
            case 22:
                return SSH;
            case 23:
                return TELNET;
            case 24:
                return PRIV_MAIL_LMTP;
            case 25:
                return SMTP;
            case 28:
                return HA;
            case 34:
                return RF;
            case 35:
                return PRIVATE_PRINTER;
            case 37:
                return TIME_PROTOCOL;
            case 39:
                return RLP;
            case 41:
                return GRAPHICS;
            case 42:
                return NAME_SERVICE;
            case 43:
                return WHOIS;
            case 47:
                return NI_FTP;
            case 49:
                return TACACS;
            case 50:
                return RMCP;
            case 51:
                return IMP_OLD;
            case 52:
                return XNS_TIME;
            case 53:
                return DNS;
            case 54:
                return XNS_CLEARINGHOUSE;
            case 55:
                return ISI_GL;
            case 56:
                return RAP_XNS_AUTH;
            case 57:
                return MTP;
            case 58:
                return XNS_MAIL;
            case 61:
                return NIFTP;
            case 67:
                return BOOTP_SERVER;
            case 68:
                return BOOTP_CLIENT;
            case 69:
                return TFTP;
            case 70:
                return GOPHER;
            case 71:
                return GENIUS_NETJRS;
            case 72:
                return NETJRS_1;
            case 73:
                return NETJRS_2;
            case 74:
                return NETJRS_3;
            case 79:
                return FINGER;
            case 80:
                return HTTP;
            case 81:
                return TORPARK_ONION_ROUTING;
            case 82:
                return TORPARK_ONION_CONTROL;
            case 83:
                return MIT_ML_DEVICE;
            case 88:
                return KERBEROS;
            case 90:
                return DNSIX_POINTCAST;
            case 95:
                return SUPDUP;
            case 99:
                return WIP_MESSAGE;
            case 101:
                return NIC_HOST_NAME;
            case 102:
                return ISO_TSAP;
            case 104:
                return DICOM;
            case 105:
                return CCSO;
            case 107:
                return RTELNET;
            case 108:
                return IBM;
            case 109:
                return POP2;
            case 110:
                return POP3;
            case 111:
                return ONC_RPC;
            case 113:
                return IDENT_AUTH;
            case 115:
                return SFTP;
            case 117:
                return UUCP;
            case 118:
                return SQL;
            case 119:
                return NNTP;
            case 123:
                return NTP;
            case 126:
                return UNISYS;
            case 135:
                return DCE_EPMAP;
            case 137:
                return NETBIOS_NAME_SERVICE;
            case 138:
                return NETBIOS_DATAGRAM_SERVICE;
            case 139:
                return NETBIOS_SESSION_SERVICE;
            case 143:
                return IMAP;
            case 148:
                return JARGON;
            case 152:
                return BFTP;
            case 153:
                return SGMP;
            case 156:
                return SQL_SERVICE;
            case 158:
                return DMSP;
            case 161:
                return SNMP;
            case 162:
                return SNMP_TRAP;
            case 170:
                return POSTSCRIPT;
            case 177:
                return XDMCP;
            case 179:
                return BGP;
            case 194:
                return IRC;
            case 199:
                return SMUX;
            case 201:
                return APPLETALK;
            case 209:
                return QMTP;
            case 210:
                return ANSI_Z_39_50;
            case 213:
                return IPX;
            case 218:
                return MPP;
            case 220:
                return IMAP_V3;
            case 256:
                return TWO_DEV_2SP;
            case 259:
                return ESRO;
            case 262:
                return ARCISDMS;
            case 264:
                return BGMP;
            case 280:
                return HTTP_MGMT;
            case 300:
                return THIN_LINC;
            case 308:
                return NOVASTOR;
            case 311:
                return APPLE_SHARE_ADMIN;
            case 318:
                return PKIX;
            case 319:
                return PTP_EVENT;
            case 320:
                return PTP_GENERAL;
            case 323:
                return IMMP;
            case 325:
                return IT_MESSAGE_MESSAGE_EVENT;
            case 327:
                return IT_MESSAGE_STATUS_CONTROL;
            case 330:
                return IT_MESSAGE_GIF_EVENT;
            case 350:
                return MATIP_A;
            case 351:
                return MATIP_B;
            case 356:
                return CLOANTO_NET;
            case 366:
                return ODMR;
            case 369:
                return RPC2PORTMAP;
            case 370:
                return CODAAUTH2_SECURECAST1;
            case 371:
                return CLEARCASE_ALBD;
            case 376:
                return AMIGA;
            case 383:
                return HP_DATA_ALARM;
            case 384:
                return A_REMOTE_NETWORK_SERVER;
            case 387:
                return AURP;
            case 388:
                return UNIDATA_LDM;
            case 389:
                return LDAP;
            case 399:
                return DECNET;
            case 401:
                return UPS;
            case 402:
                return ALTIRIS;
            case 411:
                return DIRECT_CONNECT_HUB;
            case 412:
                return DIRECT_CONNECT_C2C;
            case 427:
                return SLP;
            case 433:
                return NNTP_2;
            case 434:
                return MOBILE_IP;
            case 443:
                return HTTPS;
            case 444:
                return SNPP;
            case 445:
                return ACTIVE_DIRECTORY_SMB;
            case 464:
                return URD_SMTPS_IGMPV3LITE;
            case 475:
                return TCPNETHASPSRV;
            case 476:
                return CENTRO1;
            case 477:
                return CENTRO2;
            case 478:
                return CENTRO3;
            case 479:
                return CENTRO4;
            case 480:
                return CENTRO5;
            case 481:
                return CENTRO6;
            case 482:
                return CENTRO7;
            case 483:
                return CENTRO8;
            case 484:
                return CENTRO9;
            case 485:
                return CENTR010;
            case 486:
                return CENTRO11;
            case 487:
                return CENTRO12;
            case 488:
                return CENTRO13;
            case 489:
                return CENTRO14;
            case 490:
                return CENTRO15;
            case 491:
                return GO;
            case 497:
                return RETROSPECT;
            case 500:
                return ISAKMP_IKE;
            case 501:
                return STMF;
            case 502:
                return MODBUS_ASA_APPL_PROTO;
            case 504:
                return CITADEL;
            case 510:
                return FCP;
            case 512:
                return REXEC_COMSAT_BIFF;
            case 513:
                return WHO_RLOGIN;
            case 514:
                return RSH_SYSLOG;
            case 515:
                return LPD;
            default:
                return null;
        }
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
