package com.github.elenaAeternanox.twelfthHomeWork.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${environment}.properties"})
public interface EnvironmentConfig extends Config {
    String login();

    String password();

    String environment();
}
