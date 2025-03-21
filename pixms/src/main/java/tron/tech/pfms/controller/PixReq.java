package tron.tech.pfms.controller;

import java.math.BigDecimal;

public record PixReq(String channel, String from, String to, BigDecimal value) {
}
