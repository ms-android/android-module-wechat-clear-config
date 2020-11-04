package com.ms.module.impl.wechat;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.wechat.IWeChatClearConfigAdapter;

import java.util.ArrayList;
import java.util.List;

public class WeChatClearConfigImpl extends IWeChatClearConfigAdapter {
    public WeChatClearConfigImpl() {
        super();
    }

    private List<String> image = new ArrayList<>();

    @Override
    public void setImage(String... paths) {
        image.clear();
        for (String it : paths) {
            image.add(it);
        }
    }

    private List<String> voice = new ArrayList<>();

    @Override
    public void setVoice(String... paths) {
        voice.clear();
        for (String it : paths) {
            voice.add(it);
        }
    }


    private List<String> video = new ArrayList<>();

    @Override
    public void setVideo(String... paths) {
        video.clear();
        for (String it : paths) {
            video.add(it);
        }
    }


    private List<String> cache = new ArrayList<>();

    @Override
    public void setCache(String... paths) {
        cache.clear();
        for (String it : paths) {
            cache.add(it);
        }
    }


    private List<String> log = new ArrayList<>();

    @Override
    public void setLog(String... paths) {
        log.clear();
        for (String it : paths) {
            log.add(it);
        }
    }


    private List<String> emoji = new ArrayList<>();

    @Override
    public void setEmoji(String... paths) {
        emoji.clear();
        for (String it : paths) {
            emoji.add(it);
        }
    }

    private List<String> file = new ArrayList<>();

    @Override
    public void setFile(String... paths) {
        file.clear();
        for (String it : paths) {
            file.add(it);
        }
    }

    @Override
    public List<String> getImage() {
        return image;
    }

    @Override
    public List<String> getVoice() {
        return voice;
    }

    @Override
    public List<String> getVideo() {
        return video;
    }

    @Override
    public List<String> getCache() {
        return cache;
    }

    @Override
    public List<String> getLog() {
        return log;
    }


    @Override
    public List<String> getEmoji() {
        return emoji;
    }

    @Override
    public List<String> getFile() {
        return file;
    }

    @Override
    public String name() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_wechat_clear_config_name"));
    }

    @Override
    public String releaseDate() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_wechat_clear_config_release_date"));
    }

    @Override
    public String version() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_wechat_clear_config_version"));
    }

    @Override
    public String dependencies() {
        return Modules.getUtilsModule().getResUtils().getString(Modules.getUtilsModule().getResUtils().getId("com_ms_module_wechat_clear_config_dependencies"));
    }
}
