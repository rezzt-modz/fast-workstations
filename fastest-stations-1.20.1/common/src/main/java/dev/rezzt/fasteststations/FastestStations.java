package dev.rezzt.fasteststations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FastestStations {
    public static final String MOD_ID = "fasteststations";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Fastest Stations initialized (server-side).");
    }
}
