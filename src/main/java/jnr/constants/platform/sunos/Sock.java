// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:19:34 +0000 2009
package jnr.constants.platform.sunos;
public enum Sock implements jnr.constants.Constant {
SOCK_STREAM(2),
SOCK_DGRAM(1),
SOCK_RAW(4),
SOCK_RDM(5),
SOCK_SEQPACKET(6);
// SOCK_MAXADDRLEN not defined
private final int value;
private Sock(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 6;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
}