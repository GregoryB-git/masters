.class public final Lcom/appsflyer/internal/AFf1aSDK;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private AFInAppEventParameterName:[B

.field private AFInAppEventType:[J

.field private AFKeystoreWrapper:S

.field private afDebugLog:I

.field private afErrorLog:I

.field private afInfoLog:I

.field private final valueOf:I

.field private values:[J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;IISII)V
    .locals 1

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const p1, 0x7fffffff

    iput p1, p0, Lcom/appsflyer/internal/AFf1aSDK;->afDebugLog:I

    const/4 p1, 0x4

    invoke-static {p4, p1}, Ljava/lang/Math;->max(II)I

    move-result p4

    const/16 v0, 0x8

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result p4

    iput p4, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    new-array v0, p4, [B

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    new-array v0, p1, [J

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventType:[J

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1aSDK;->values:[J

    iput p4, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    iput p4, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    xor-int p1, p2, p6

    xor-int p2, p4, p6

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFg1zSDK;->AFInAppEventType(II)[J

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventType:[J

    xor-int p1, p3, p6

    xor-int p2, p5, p6

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFg1zSDK;->AFInAppEventType(II)[J

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1aSDK;->values:[J

    return-void
.end method

.method private AFKeystoreWrapper()V
    .locals 13

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventType:[J

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->values:[J

    iget-short v2, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFKeystoreWrapper:S

    rem-int/lit8 v3, v2, 0x4

    aget-wide v3, v0, v3

    const-wide/32 v5, 0x7ffffdcd

    mul-long/2addr v3, v5

    add-int/lit8 v7, v2, 0x2

    rem-int/lit8 v7, v7, 0x4

    aget-wide v7, v1, v7

    add-long/2addr v3, v7

    const-wide/32 v9, 0x7fffffff

    rem-long/2addr v3, v9

    add-int/lit8 v2, v2, 0x3

    rem-int/lit8 v2, v2, 0x4

    aget-wide v11, v0, v2

    mul-long/2addr v11, v5

    add-long/2addr v11, v7

    div-long/2addr v11, v9

    aput-wide v11, v1, v2

    aput-wide v3, v0, v2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    aget-byte v2, v1, v0

    int-to-long v2, v2

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventType:[J

    iget-short v5, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFKeystoreWrapper:S

    aget-wide v5, v4, v5

    shl-int/lit8 v4, v0, 0x3

    shr-long v4, v5, v4

    const-wide/16 v6, 0xff

    and-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-short v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFKeystoreWrapper:S

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x4

    int-to-short v0, v0

    iput-short v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFKeystoreWrapper:S

    return-void
.end method

.method private valueOf()I
    .locals 6

    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afDebugLog:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afDebugLog:I

    :cond_0
    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    iget v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    iget v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->afDebugLog:I

    int-to-byte v2, v1

    const/4 v3, 0x0

    aput-byte v2, v0, v3

    const-string v0, "unexpected block size"

    if-ltz v1, :cond_5

    const/4 v1, 0x1

    :cond_1
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    iget v5, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    sub-int/2addr v5, v1

    invoke-virtual {v2, v4, v1, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-lez v2, :cond_2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    if-lt v1, v2, :cond_1

    :cond_2
    iget v2, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    if-lt v1, v2, :cond_4

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1aSDK;->AFKeystoreWrapper()V

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afDebugLog:I

    iput v3, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    if-gez v0, :cond_3

    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    add-int/lit8 v2, v0, -0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->valueOf:I

    :goto_0
    iput v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_1
    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    return v0
.end method


# virtual methods
.method public final available()I
    .locals 2

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1aSDK;->valueOf()I

    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    iget v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1aSDK;->valueOf()I

    iget v0, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    iget v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    .line 2
    add-int v0, p2, p3

    move v1, p2

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1aSDK;->valueOf()I

    iget v2, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    iget v3, p0, Lcom/appsflyer/internal/AFf1aSDK;->afErrorLog:I

    if-lt v2, v3, :cond_1

    if-ne v1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr v0, v1

    sub-int/2addr p3, v0

    return p3

    :cond_1
    add-int/lit8 v3, v1, 0x1

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1aSDK;->AFInAppEventParameterName:[B

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Lcom/appsflyer/internal/AFf1aSDK;->afInfoLog:I

    aget-byte v2, v4, v2

    aput-byte v2, p1, v1

    move v1, v3

    goto :goto_0

    :cond_2
    return p3
.end method

.method public final skip(J)J
    .locals 4

    const-wide/16 v0, 0x0

    :goto_0
    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method
