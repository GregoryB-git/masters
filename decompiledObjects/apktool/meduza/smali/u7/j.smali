.class public final Lu7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lv6/g;->b(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "ApplicationId must be set."

    invoke-static {v0, v1}, Lm6/j;->k(ZLjava/lang/String;)V

    iput-object p1, p0, Lu7/j;->b:Ljava/lang/String;

    iput-object p2, p0, Lu7/j;->a:Ljava/lang/String;

    iput-object p3, p0, Lu7/j;->c:Ljava/lang/String;

    iput-object p4, p0, Lu7/j;->d:Ljava/lang/String;

    iput-object p5, p0, Lu7/j;->e:Ljava/lang/String;

    iput-object p6, p0, Lu7/j;->f:Ljava/lang/String;

    iput-object p7, p0, Lu7/j;->g:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lu7/j;
    .locals 9

    new-instance v0, Ll3/l;

    invoke-direct {v0, p0}, Ll3/l;-><init>(Landroid/content/Context;)V

    const-string p0, "google_app_id"

    invoke-virtual {v0, p0}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Lu7/j;

    const-string v1, "google_api_key"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "firebase_database_url"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "ga_trackingId"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "gcm_defaultSenderId"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "google_storage_bucket"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "project_id"

    invoke-virtual {v0, v1}, Ll3/l;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lu7/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu7/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu7/j;

    iget-object v0, p0, Lu7/j;->b:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->a:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->c:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->d:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->d:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->e:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->e:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->f:Ljava/lang/String;

    iget-object v2, p1, Lu7/j;->f:Ljava/lang/String;

    invoke-static {v0, v2}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu7/j;->g:Ljava/lang/String;

    iget-object p1, p1, Lu7/j;->g:Ljava/lang/String;

    invoke-static {v0, p1}, Lm6/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu7/j;->b:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->a:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->c:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->d:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->e:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->f:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lu7/j;->g:Ljava/lang/String;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lm6/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm6/h$a;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu7/j;->b:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "applicationId"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lu7/j;->a:Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "apiKey"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lu7/j;->c:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "databaseUrl"

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lu7/j;->e:Ljava/lang/String;

    .line 28
    .line 29
    const-string v2, "gcmSenderId"

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lu7/j;->f:Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "storageBucket"

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lu7/j;->g:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "projectId"

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lm6/h$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lm6/h$a;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
