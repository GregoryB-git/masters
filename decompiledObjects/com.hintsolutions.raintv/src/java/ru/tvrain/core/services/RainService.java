/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  okhttp3.ResponseBody
 *  retrofit2.Call
 *  retrofit2.http.DELETE
 *  retrofit2.http.Field
 *  retrofit2.http.FormUrlEncoded
 *  retrofit2.http.GET
 *  retrofit2.http.Header
 *  retrofit2.http.POST
 *  retrofit2.http.PUT
 *  retrofit2.http.Path
 *  retrofit2.http.Query
 *  retrofit2.http.QueryMap
 *  retrofit2.http.Streaming
 *  retrofit2.http.Url
 *  ru.tvrain.core.data.AutoVideo
 *  ru.tvrain.core.data.Video
 *  rx.Observable
 */
package ru.tvrain.core.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.ArticleWidgetHtml;
import ru.tvrain.core.data.Articles;
import ru.tvrain.core.data.Audio;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.ContentBlock;
import ru.tvrain.core.data.FirstScreenResponseItem;
import ru.tvrain.core.data.InAppSubscription;
import ru.tvrain.core.data.InviteLinkResponse;
import ru.tvrain.core.data.InviteStatsResponse;
import ru.tvrain.core.data.LinkInfo;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.Offerta;
import ru.tvrain.core.data.Playlist;
import ru.tvrain.core.data.Programs;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.RecommendationsResponse;
import ru.tvrain.core.data.ScheduleProgram;
import ru.tvrain.core.data.Story;
import ru.tvrain.core.data.UserInfo;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.data.rain_country.RCProfileInfo;
import ru.tvrain.core.data.search.SearchPlaceholdersResponse;
import ru.tvrain.core.data.search.SearchResponse;
import rx.Observable;

public interface RainService {
    public static final String PERIOD_FOREVER = "forever";
    public static final String PERIOD_HALF_YEAR = "6m";
    public static final String PERIOD_MONTH = "1m";
    public static final String PERIOD_WEEK = "1w";
    public static final String PERIOD_YEAR = "12m";

    @FormUrlEncoded
    @POST(value="favorites/articles/")
    public Observable<ResponseBody> addArticleToFavorites(@Header(value="Authorization") String var1, @Field(value="articles") String var2);

    @FormUrlEncoded
    @POST(value="favorites/programs/")
    public Observable<ResponseBody> addProgramToFavorites(@Header(value="Authorization") String var1, @Field(value="programs") String var2);

    @GET(value="articles/{ids}/auto/")
    public Observable<ArrayList<AutoVideo>> articleAutoVideos(@Header(value="Authorization") String var1, @Path(value="ids") String var2);

    @GET(value="articles/{ids}/videos/")
    public Observable<ArrayList<Video>> articleVideos(@Header(value="Authorization") String var1, @Path(value="ids") String var2);

    @GET(value="articles/{ids}/mp4/")
    public Observable<ArrayList<Video>> articleVideosMp4(@Header(value="Authorization") String var1, @Path(value="ids") String var2);

    @GET(value="articles/get/{ids}/")
    public Observable<ResponseBody> articlesById(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Path(value="ids") String var4);

    @FormUrlEncoded
    @POST(value="user/quickauth/")
    public Observable<RainUser> authByDeviceId(@Field(value="device_uid") String var1);

    @FormUrlEncoded
    @POST(value="user/auth/")
    public Observable<RainUser> authByLogin(@Header(value="Authorization") String var1, @Field(value="email") String var2, @Field(value="passw") String var3);

    @POST(value="user/socauth/{social_network}/{headers_hash}/")
    public Observable<RainUser> authBySocialNetworks(@Path(value="social_network") String var1, @Path(value="headers_hash") String var2);

    @GET(value="widgets/contentblock/{code}/")
    public Observable<ContentBlock> contentBlock(@Header(value="Authorization") String var1, @Path(value="code") String var2, @Header(value="X-Result-Define-Thumb-Width") Integer var3, @Header(value="X-Result-Define-Thumb-Height") Integer var4);

    @DELETE(value="favorites/articles/")
    public Observable<ResponseBody> deleteArticleFromFavorites(@Header(value="Authorization") String var1, @Query(value="articles") String var2);

    @DELETE(value="favorites/programs/")
    public Observable<ResponseBody> deleteProgramFromFavorites(@Header(value="Authorization") String var1, @Query(value="programs") String var2);

    @GET
    @Streaming
    public Observable<ResponseBody> downloadFileWithDynamicUrl(@Url String var1);

    @FormUrlEncoded
    @POST(value="user/socauthwithtoken/service/facebook/")
    public Observable<RainUser> facebookLogin(@Field(value="token") String var1);

    @GET(value="widgets/firstscreen/")
    public Observable<ArrayList<FirstScreenResponseItem>> firstScreen(@Header(value="Authorization") String var1);

    @GET(value="articles/{ids}/audio/")
    public Observable<ArrayList<Audio>> getArticleAudio(@Header(value="Authorization") String var1, @Path(value="ids") String var2);

    @GET(value="articles/{ids}/hls/")
    public Observable<ArrayList<Video>> getArticleHlsVideo(@Header(value="Authorization") String var1, @Path(value="ids") String var2);

    @GET(value="widgets/best/")
    public Observable<List<Article>> getBestArticles(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3);

    @GET(value="programs/categories/")
    public Observable<ResponseBody> getCategories(@Header(value="Authorization") String var1);

    @GET(value="user/me/")
    public Observable<UserInfo> getCurrentUser(@Header(value="Authorization") String var1);

    @GET(value="favorites/articles/")
    public Observable<Articles> getFavoriteArticles(@Header(value="Authorization") String var1, @Query(value="order") String var2, @Header(value="X-Result-Define-Thumb-Width") Integer var3, @Header(value="X-Result-Define-Thumb-Height") Integer var4);

    @GET(value="programs/favorites")
    public Observable<Programs> getFavoritePrograms(@Header(value="Authorization") String var1, @Query(value="order") String var2, @Header(value="X-Result-Define-Thumb-Width") Integer var3, @Header(value="X-Result-Define-Thumb-Height") Integer var4);

    @GET(value="pay/goods/android/")
    public Observable<ArrayList<InAppSubscription>> getInAppsList();

    @GET(value="invite/code/")
    public Observable<InviteLinkResponse> getInviteLink(@Header(value="Authorization") String var1);

    @GET(value="invite/stats/")
    public Observable<InviteStatsResponse> getInviteStats(@Header(value="Authorization") String var1);

    @GET(value="raincountry/profile/")
    public Observable<RCProfileInfo> getMyRCProfile(@Header(value="Authorization") String var1);

    @GET(value="pay/oferta/")
    public Observable<Offerta> getOferta();

    @GET(value="widgets/ourchoice/")
    public Observable<List<Article>> getOurChoice(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Header(value="X-Result-Define-Video-Only-Flag") String var4);

    @GET(value="widgets/popular/")
    public Observable<Articles> getPopular(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Period") String var2, @Header(value="X-Result-Define-Video-Only-Flag") String var3, @Header(value="X-Result-Define-Thumb-Width") Integer var4, @Header(value="X-Result-Define-Thumb-Height") Integer var5);

    @GET(value="programs/")
    public Observable<Programs> getProgramsByCategory(@Header(value="Authorization") String var1, @Query(value="category_id") String var2, @Query(value="only_popular") String var3, @Header(value="X-Result-Define-Thumb-Width") Integer var4, @Header(value="X-Result-Define-Thumb-Height") Integer var5);

    @GET(value="recommended/")
    public Observable<RecommendationsResponse> getRecommendations(@Query(value="article_id") Integer var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3);

    @GET(value="schedule/{date}/")
    public Observable<List<ScheduleProgram>> getSchedule(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Path(value="date") String var4);

    @GET(value="widgets/underarticleheader/")
    public Observable<ArticleWidgetHtml> getUnderArticleHeader();

    @GET(value="widgets/undermainheader/")
    public Observable<ArticleWidgetHtml> getUnderMainHeader();

    @GET(value="user/accountsurls/")
    public Observable<ArrayList<String>> getUserAccountsUrls(@Header(value="Authorization") String var1);

    @FormUrlEncoded
    @POST(value="user/socAuthWithJWT/service/google/")
    public Observable<RainUser> googleLogin(@Field(value="token") String var1);

    @FormUrlEncoded
    @POST(value="user/link/")
    public Observable<RainUser> link(@Header(value="Authorization") String var1, @Field(value="device_uid") String var2, @Field(value="oid") String var3);

    @GET(value="live/")
    public Observable<Live> live(@Header(value="Authorization") String var1);

    @POST(value="user/logout/")
    public Observable<ResponseBody> logout(@Header(value="Authorization") String var1);

    @FormUrlEncoded
    @POST(value="user/socauthwithtoken/service/mailru/")
    public Observable<RainUser> mailLogin(@Field(value="token") String var1);

    @GET(value="widgets/newslist/")
    public Observable<Articles> newsList(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Header(value="X-Result-Define-Pagination") String var4);

    @FormUrlEncoded
    @POST(value="user/passrecovery/")
    public Observable<ResponseBody> passrecovery(@Field(value="email") String var1);

    @GET(value="live/playlists/")
    public Observable<List<Playlist>> playlists(@Header(value="Authorization") String var1);

    @GET(value="programs/{id}/articles/")
    public Observable<Articles> programArticles(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Header(value="X-Result-Define-Video-Only-Flag") String var4, @Header(value="X-Result-Define-Pagination") String var5, @Header(value="X-Result-Define-Only-Full-Flag") String var6, @Path(value="id") int var7);

    @GET(value="programs/{id}/articles/mostpopular/")
    public Observable<Articles> programArticlesMostPopular(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Header(value="X-Result-Define-Video-Only-Flag") String var4, @Header(value="X-Result-Define-Pagination") String var5, @Header(value="X-Result-Define-Only-Full-Flag") String var6, @Path(value="id") int var7);

    @GET(value="programs/")
    public Observable<Programs> programs(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Header(value="X-Result-Define-Pagination") String var4, @Query(value="only_popular") String var5);

    @GET(value="programs/{ids}/")
    public Observable<ResponseBody> programsById(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Path(value="ids") String var4);

    @FormUrlEncoded
    @PUT(value="user/me/")
    public Observable<ResponseBody> putUserInfo(@Header(value="Authorization") String var1, @Field(value="firstname") String var2, @Field(value="lastname") String var3, @Field(value="birthday") String var4, @Field(value="email") String var5, @Field(value="city") String var6, @Field(value="phone") String var7, @Field(value="recieve_mailing") String var8);

    @FormUrlEncoded
    @POST(value="pay/googleplay/receipt/")
    public Observable<ResponseBody> receiptValidation(@Header(value="Authorization") String var1, @Field(value="receipt") String var2, @Field(value="signature") String var3);

    @FormUrlEncoded
    @POST(value="user/")
    public Observable<RainUser> registration(@Header(value="Authorization") String var1, @Field(value="firstname") String var2, @Field(value="email") String var3, @Field(value="password1") String var4, @Field(value="password2") String var5);

    @GET(value="search/")
    public Observable<SearchResponse> search(@Query(value="query") String var1, @Query(value="category") String var2, @Query(value="only_video") String var3, @Header(value="X-Result-Define-Pagination") String var4, @Header(value="X-Result-Define-Thumb-Width") Integer var5, @Header(value="X-Result-Define-Thumb-Height") Integer var6);

    @GET(value="search/placeholders/")
    public Observable<SearchPlaceholdersResponse> searchPlaceholders();

    @GET(value="search/")
    public Call<SearchResponse> searchSync(@Query(value="query") String var1, @Query(value="category") String var2, @Query(value="only_video") String var3, @Header(value="X-Result-Define-Thumb-Width") Integer var4, @Header(value="X-Result-Define-Thumb-Height") Integer var5);

    @FormUrlEncoded
    @POST(value="pay/setbilldata/")
    public Observable<ResponseBody> sendPurchaseInfo(@Header(value="Authorization") String var1, @Field(value="email") String var2, @Field(value="phone") String var3);

    @GET
    public Observable<ResponseBody> sendRainStatistics(@Url String var1, @QueryMap Map<String, String> var2);

    @FormUrlEncoded
    @POST(value="recommended/click/")
    public Observable<ResponseBody> sendRecommendedClicked(@Field(value="article_id") Integer var1, @Field(value="rid") String var2);

    @FormUrlEncoded
    @POST(value="articles/setvideoposition/")
    public Observable<ResponseBody> setVideoPosition(@Header(value="Authorization") String var1, @Field(value="video_id") int var2, @Field(value="position") long var3);

    @FormUrlEncoded
    @POST(value="user/startlinking/")
    public Observable<LinkInfo> startlinking(@Header(value="Authorization") String var1, @Field(value="ass") String var2);

    @GET(value="articles/")
    public Observable<Story> story(@Header(value="Authorization") String var1, @Header(value="X-Result-Define-Thumb-Width") Integer var2, @Header(value="X-Result-Define-Thumb-Height") Integer var3, @Query(value="story_id") int var4, @Header(value="X-Result-Define-Pagination") String var5);

    @FormUrlEncoded
    @POST(value="user/socauthwithtoken/service/twitter/")
    public Observable<RainUser> twitterLogin(@Field(value="token") String var1, @Field(value="token_secret") String var2);

    @FormUrlEncoded
    @POST(value="user/socauthwithtoken/service/vkontakte/")
    public Observable<RainUser> vkLogin(@Field(value="token") String var1);

    @FormUrlEncoded
    @POST(value="user/socauthwithtoken/service/yandex/")
    public Observable<RainUser> yandexLogin(@Field(value="token") String var1);
}

