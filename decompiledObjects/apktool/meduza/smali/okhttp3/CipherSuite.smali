.class public final Lokhttp3/CipherSuite;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final d:Lokhttp3/CipherSuite;

.field public static final e:Lokhttp3/CipherSuite;

.field public static final f:Lokhttp3/CipherSuite;

.field public static final g:Lokhttp3/CipherSuite;

.field public static final h:Lokhttp3/CipherSuite;

.field public static final i:Lokhttp3/CipherSuite;

.field public static final j:Lokhttp3/CipherSuite;

.field public static final k:Lokhttp3/CipherSuite;

.field public static final l:Lokhttp3/CipherSuite;

.field public static final m:Lokhttp3/CipherSuite;

.field public static final n:Lokhttp3/CipherSuite;

.field public static final o:Lokhttp3/CipherSuite;

.field public static final p:Lokhttp3/CipherSuite;

.field public static final q:Lokhttp3/CipherSuite;

.field public static final r:Lokhttp3/CipherSuite;

.field public static final s:Lokhttp3/CipherSuite;

.field public static final t:Lokhttp3/CipherSuite;

.field public static final u:Lokhttp3/CipherSuite;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lokhttp3/CipherSuite$1;

    invoke-direct {v0}, Lokhttp3/CipherSuite$1;-><init>()V

    sput-object v0, Lokhttp3/CipherSuite;->b:Ljava/util/Comparator;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lokhttp3/CipherSuite;->c:Ljava/util/LinkedHashMap;

    const-string v0, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->d:Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->e:Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->f:Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->g:Lokhttp3/CipherSuite;

    const-string v0, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->h:Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_FALLBACK_SCSV"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->i:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->j:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->k:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->l:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->m:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->n:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->o:Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->p:Lokhttp3/CipherSuite;

    const-string v0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    const-string v0, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->q:Lokhttp3/CipherSuite;

    const-string v0, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->r:Lokhttp3/CipherSuite;

    const-string v0, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->s:Lokhttp3/CipherSuite;

    const-string v0, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->t:Lokhttp3/CipherSuite;

    const-string v0, "TLS_AES_256_CCM_8_SHA256"

    invoke-static {v0}, Lokhttp3/CipherSuite;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v0

    sput-object v0, Lokhttp3/CipherSuite;->u:Lokhttp3/CipherSuite;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lokhttp3/CipherSuite;->a:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;)Lokhttp3/CipherSuite;
    .locals 3

    const-class v0, Lokhttp3/CipherSuite;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lokhttp3/CipherSuite;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/CipherSuite;

    if-nez v2, :cond_1

    invoke-static {p0}, Lokhttp3/CipherSuite;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/CipherSuite;

    if-nez v2, :cond_0

    new-instance v2, Lokhttp3/CipherSuite;

    invoke-direct {v2, p0}, Lokhttp3/CipherSuite;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static b(Ljava/lang/String;)Lokhttp3/CipherSuite;
    .locals 2

    new-instance v0, Lokhttp3/CipherSuite;

    invoke-direct {v0, p0}, Lokhttp3/CipherSuite;-><init>(Ljava/lang/String;)V

    sget-object v1, Lokhttp3/CipherSuite;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "TLS_"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x4

    .line 8
    const-string v3, "SSL_"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_1
    return-object p0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lokhttp3/CipherSuite;->a:Ljava/lang/String;

    return-object v0
.end method
