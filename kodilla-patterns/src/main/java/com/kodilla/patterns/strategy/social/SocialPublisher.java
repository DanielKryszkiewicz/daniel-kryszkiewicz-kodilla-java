package com.kodilla.patterns.strategy.social;

public sealed interface SocialPublisher
        permits TwitterPublisher, FacebookPublisher, SnapchatPublisher {

    public String share();
}

