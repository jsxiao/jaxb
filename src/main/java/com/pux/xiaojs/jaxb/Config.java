package com.pux.xiaojs.jaxb;

import javax.xml.bind.annotation.*;

/**
 * Created by xiaojs on 18/8/8.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "config", propOrder = {"url", "notifyUrl", "retUrl"})
public class Config {

    @XmlElement
    private String url;

    @XmlElement(required = false, name = "notify_url")
    private String notifyUrl;

    @XmlElement
    private String retUrl;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public void setRetUrl(String retUrl) {
        this.retUrl = retUrl;
    }
}
