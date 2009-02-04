// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 28 22:43:19 -0800 2008
package com.kenai.constantine.platform.darwin;
public enum RLIMIT implements com.kenai.constantine.Constant {
RLIMIT_AS(5),
RLIMIT_CORE(4),
RLIMIT_CPU(0),
RLIMIT_DATA(2),
RLIMIT_FSIZE(1),
// RLIMIT_LOCKS not defined
RLIMIT_MEMLOCK(6),
// RLIMIT_MSGQUEUE not defined
// RLIMIT_NICE not defined
// RLIMIT_NLIMITS not defined
RLIMIT_NOFILE(8),
RLIMIT_NPROC(7),
// RLIMIT_OFILE not defined
RLIMIT_RSS(5),
// RLIMIT_RTPRIO not defined
// RLIMIT_RTTIME not defined
// RLIMIT_SIGPENDING not defined
RLIMIT_STACK(3);
private final int value;
private RLIMIT(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 8;

public final int value() { return value; }
}