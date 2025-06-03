.class public final Ld2/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Ld2/z$b;

.field public static final B:Ld2/z$a;

.field public static final C:Ld2/a$h;

.field public static final D:Ld2/i0$a;

.field public static final E:Ld2/a$d;

.field public static final F:Ld2/a$d;

.field public static final G:Ld2/a$h;

.field public static final H:Ld2/a$d;

.field public static final I:Ld2/a$d;

.field public static final J:Ld2/a$d;

.field public static final K:Ld2/a$d;

.field public static final L:Ld2/a$d;

.field public static final M:Ld2/a$d;

.field public static final N:Ld2/a$d;

.field public static final O:Ld2/a$d;

.field public static final a:Ld2/a$b;

.field public static final b:Ld2/a$e;

.field public static final c:Ld2/a$c;

.field public static final d:Ld2/a$f;

.field public static final e:Ld2/a$f;

.field public static final f:Ld2/a$f;

.field public static final g:Ld2/a$f;

.field public static final h:Ld2/a$c;

.field public static final i:Ld2/a$c;

.field public static final j:Ld2/a$c;

.field public static final k:Ld2/a$c;

.field public static final l:Ld2/a$c;

.field public static final m:Ld2/a$c;

.field public static final n:Ld2/a$b;

.field public static final o:Ld2/a$b;

.field public static final p:Ld2/a$f;

.field public static final q:Ld2/a$f;

.field public static final r:Ld2/a$f;

.field public static final s:Ld2/a$b;

.field public static final t:Ld2/a$b;

.field public static final u:Ld2/a$d;

.field public static final v:Ld2/a$b;

.field public static final w:Ld2/a$b;

.field public static final x:Ld2/a$b;

.field public static final y:Ld2/a$h;

.field public static final z:Ld2/a$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld2/a$b;

    const-string v1, "VISUAL_STATE_CALLBACK"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$b;

    const-string v1, "OFF_SCREEN_PRERASTER"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->a:Ld2/a$b;

    new-instance v0, Ld2/a$e;

    const-string v1, "SAFE_BROWSING_ENABLE"

    invoke-direct {v0, v1, v1}, Ld2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->b:Ld2/a$e;

    new-instance v0, Ld2/a$c;

    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->c:Ld2/a$c;

    new-instance v0, Ld2/a$f;

    const-string v1, "START_SAFE_BROWSING"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->d:Ld2/a$f;

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_WHITELIST"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$f;

    const-string v2, "SAFE_BROWSING_ALLOWLIST"

    invoke-direct {v0, v1, v2}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$f;

    invoke-direct {v0, v2, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->e:Ld2/a$f;

    new-instance v0, Ld2/a$f;

    invoke-direct {v0, v2, v2}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->f:Ld2/a$f;

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->g:Ld2/a$f;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->h:Ld2/a$c;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->i:Ld2/a$c;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->j:Ld2/a$c;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->k:Ld2/a$c;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->l:Ld2/a$c;

    new-instance v0, Ld2/a$c;

    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$b;

    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$b;

    const-string v1, "RECEIVE_HTTP_ERROR"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$c;

    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_HIT"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$c;

    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    invoke-direct {v0, v1, v1}, Ld2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->m:Ld2/a$c;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->n:Ld2/a$b;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->o:Ld2/a$b;

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->p:Ld2/a$f;

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->q:Ld2/a$f;

    new-instance v0, Ld2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    invoke-direct {v0, v1, v1}, Ld2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->r:Ld2/a$f;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->s:Ld2/a$b;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->t:Ld2/a$b;

    new-instance v0, Ld2/a$d;

    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->u:Ld2/a$d;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->v:Ld2/a$b;

    new-instance v0, Ld2/a$b;

    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->w:Ld2/a$b;

    new-instance v0, Ld2/a$b;

    const-string v1, "POST_WEB_MESSAGE"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->x:Ld2/a$b;

    new-instance v0, Ld2/a$b;

    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    invoke-direct {v0, v1, v1}, Ld2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$e;

    const-string v1, "GET_WEB_VIEW_CLIENT"

    invoke-direct {v0, v1, v1}, Ld2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$e;

    const-string v1, "GET_WEB_CHROME_CLIENT"

    invoke-direct {v0, v1, v1}, Ld2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$h;

    const-string v1, "GET_WEB_VIEW_RENDERER"

    invoke-direct {v0, v1, v1}, Ld2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$h;

    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    invoke-direct {v0, v1, v1}, Ld2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->y:Ld2/a$h;

    new-instance v0, Ld2/a$g;

    invoke-direct {v0}, Ld2/a$g;-><init>()V

    sput-object v0, Ld2/i0;->z:Ld2/a$g;

    new-instance v0, Ld2/z$b;

    invoke-direct {v0}, Ld2/z$b;-><init>()V

    sput-object v0, Ld2/i0;->A:Ld2/z$b;

    new-instance v0, Ld2/z$a;

    invoke-direct {v0}, Ld2/z$a;-><init>()V

    sput-object v0, Ld2/i0;->B:Ld2/z$a;

    new-instance v0, Ld2/a$h;

    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    invoke-direct {v0, v1, v1}, Ld2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->C:Ld2/a$h;

    new-instance v0, Ld2/i0$a;

    invoke-direct {v0}, Ld2/i0$a;-><init>()V

    sput-object v0, Ld2/i0;->D:Ld2/i0$a;

    new-instance v0, Ld2/a$d;

    const-string v1, "PROXY_OVERRIDE"

    const-string v2, "PROXY_OVERRIDE:3"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->E:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "MULTI_PROCESS"

    const-string v2, "MULTI_PROCESS_QUERY"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->F:Ld2/a$d;

    new-instance v0, Ld2/a$h;

    const-string v1, "FORCE_DARK"

    invoke-direct {v0, v1, v1}, Ld2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->G:Ld2/a$h;

    new-instance v0, Ld2/a$d;

    const-string v1, "FORCE_DARK_STRATEGY"

    const-string v2, "FORCE_DARK_BEHAVIOR"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->H:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "WEB_MESSAGE_LISTENER"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->I:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "DOCUMENT_START_SCRIPT"

    const-string v2, "DOCUMENT_START_SCRIPT:1"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->J:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->K:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "GET_VARIATIONS_HEADER"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->L:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->M:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "GET_COOKIE_INFO"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->N:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ld2/i0;->O:Ld2/a$d;

    new-instance v0, Ld2/a$d;

    const-string v1, "USER_AGENT_METADATA"

    invoke-direct {v0, v1, v1}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/i0$b;

    invoke-direct {v0}, Ld2/i0$b;-><init>()V

    new-instance v0, Ld2/a$d;

    const-string v1, "ATTRIBUTION_REGISTRATION_BEHAVIOR"

    const-string v2, "ATTRIBUTION_BEHAVIOR"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$d;

    const-string v1, "WEBVIEW_MEDIA_INTEGRITY_API_STATUS"

    const-string v2, "WEBVIEW_INTEGRITY_API_STATUS"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ld2/a$d;

    const-string v1, "MUTE_AUDIO"

    const-string v2, "MUTE_AUDIO"

    invoke-direct {v0, v1, v2}, Ld2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a()Ljava/lang/UnsupportedOperationException;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
