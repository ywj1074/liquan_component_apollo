package com.ctrip.framework.apollo.core.enums;

import com.ctrip.framework.apollo.core.utils.StringUtils;

public final class EnvUtils {
  
  public static Env transformEnv(String envName) {
    if (StringUtils.isBlank(envName)) {
      return Env.UNKNOWN;
    }
    switch (envName.trim().toUpperCase()) {
      case "LPT":
        return Env.LPT;
      case "FAT":
      case "FWS":
        return Env.FAT;
      case "UAT":
        return Env.UAT;
      case "DEV":
        return Env.DEV;
      case "LOCAL":
        return Env.LOCAL;
      case "TOOLS":
        return Env.TOOLS;
      case "DOCKER1":
        return Env.DOCKER1;
      case "DOCKER2":
        return Env.DOCKER2;
      case "DOCKER3":
        return Env.DOCKER3;
      case "DOCKER4":
        return Env.DOCKER4;
      case "DOCKER5":
        return Env.DOCKER5;
      case "PRE":
        return Env.PRE;
      case "PRO":
      case "PROD":
        return Env.PROD;
      default:
        return Env.UNKNOWN;
    }
  }
}
