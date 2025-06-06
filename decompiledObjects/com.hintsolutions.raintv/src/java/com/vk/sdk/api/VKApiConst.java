/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.api;

public class VKApiConst {
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ADULT = "adult";
    public static final String AGE_FROM = "age_from";
    public static final String AGE_TO = "age_to";
    public static final String ALBUM_ID = "album_id";
    public static final String ATTACHMENTS = "attachments";
    public static final String AUTO_COMPLETE = "auto_complete";
    public static final String BIRTH_DAY = "birth_day";
    public static final String BIRTH_MONTH = "birth_month";
    public static final String BIRTH_YEAR = "birth_year";
    public static final String CAPTCHA_IMG = "captcha_img";
    public static final String CAPTCHA_KEY = "captcha_key";
    public static final String CAPTCHA_SID = "captcha_sid";
    public static final String CITY = "city";
    public static final String COMPANY = "company";
    public static final String COUNT = "count";
    public static final String COUNTRY = "country";
    public static final String ERROR_CODE = "error_code";
    public static final String ERROR_MSG = "error_msg";
    public static final String EXTENDED = "extended";
    public static final String FEED = "feed";
    public static final String FEED_TYPE = "feed_type";
    public static final String FIELDS = "fields";
    public static final String FILTERS = "filters";
    public static final String FRIENDS_ONLY = "friends_only";
    public static final String FROM_GROUP = "from_group";
    public static final String GROUP_ID = "group_id";
    public static final String HAS_PHOTO = "has_photo";
    public static final String HOMETOWN = "hometown";
    public static final String HTTPS = "https";
    public static final String INTERESTS = "interests";
    public static final String LANG = "lang";
    public static final String LAST_MESSAGE_ID = "last_message_id";
    public static final String LAT = "lat";
    public static final String LONG = "long";
    public static final String MESSAGE = "message";
    public static final String NAME_CASE = "name_case";
    public static final String OFFSET = "offset";
    public static final String ONLINE = "online";
    public static final String OUT = "out";
    public static final String OWNER_ID = "owner_id";
    public static final String PHOTO = "photo";
    public static final String PHOTOS = "photos";
    public static final String PHOTO_IDS = "photo_ids";
    public static final String PHOTO_SIZES = "photo_sizes";
    public static final String PLACE_ID = "place_id";
    public static final String POSITION = "position";
    public static final String POSTS = "posts";
    public static final String POST_ID = "post_id";
    public static final String PREVIEW_LENGTH = "preview_length";
    public static final String PUBLISH_DATE = "publish_date";
    public static final String Q = "q";
    public static final String REDIRECT_URI = "redirect_uri";
    public static final String RELIGION = "religion";
    public static final String REQUEST_PARAMS = "request_params";
    public static final String REV = "rev";
    public static final String SCHOOL = "school";
    public static final String SCHOOL_CITY = "school_city";
    public static final String SCHOOL_COUNTRY = "school_country";
    public static final String SCHOOL_YEAR = "school_year";
    public static final String SERVICES = "services";
    public static final String SEX = "sex";
    public static final String SIG = "sig";
    public static final String SIGNED = "signed";
    public static final String SORT = "sort";
    public static final String START_MESSAGE_ID = "start_message_id";
    public static final String STATUS = "status";
    public static final String TIME_OFFSET = "time_offset";
    public static final String UNIVERSITY = "university";
    public static final String UNIVERSITY_COUNTRY = "university_country";
    public static final String UNIVERSITY_YEAR = "university_year";
    public static final String UNREAD = "unread";
    public static final String USER_ID = "user_id";
    public static final String USER_IDS = "user_ids";
    public static final String VERSION = "v";
    public static final String VKCaptchaAnsweredEvent = "VKCaptchaAnsweredEvent";

    public static final class VKProgressType
    extends Enum<VKProgressType> {
        private static final VKProgressType[] $VALUES;
        public static final /* enum */ VKProgressType VKProgressTypeDownload;
        public static final /* enum */ VKProgressType VKProgressTypeUpload;

        static {
            VKProgressType vKProgressType;
            VKProgressType vKProgressType2;
            VKProgressTypeUpload = vKProgressType2 = new VKProgressType();
            VKProgressTypeDownload = vKProgressType = new VKProgressType();
            $VALUES = new VKProgressType[]{vKProgressType2, vKProgressType};
        }

        public static VKProgressType valueOf(String string2) {
            return (VKProgressType)Enum.valueOf(VKProgressType.class, (String)string2);
        }

        public static VKProgressType[] values() {
            return (VKProgressType[])$VALUES.clone();
        }
    }
}

