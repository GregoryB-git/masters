.class public final enum LA1/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LA1/o;

.field public static final enum q:LA1/o;

.field public static final enum r:LA1/o;

.field public static final enum s:LA1/o;

.field public static final synthetic t:[LA1/o;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LA1/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "endpoint"

    .line 5
    .line 6
    const-string v3, "URL"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LA1/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LA1/o;->p:LA1/o;

    .line 12
    .line 13
    new-instance v0, LA1/o;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "is_enabled"

    .line 17
    .line 18
    const-string v3, "ENABLED"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LA1/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LA1/o;->q:LA1/o;

    .line 24
    .line 25
    new-instance v0, LA1/o;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "dataset_id"

    .line 29
    .line 30
    const-string v3, "DATASETID"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LA1/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LA1/o;->r:LA1/o;

    .line 36
    .line 37
    new-instance v0, LA1/o;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "access_key"

    .line 41
    .line 42
    const-string v3, "ACCESSKEY"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, LA1/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LA1/o;->s:LA1/o;

    .line 48
    .line 49
    invoke-static {}, LA1/o;->c()[LA1/o;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LA1/o;->t:[LA1/o;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LA1/o;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LA1/o;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [LA1/o;

    .line 3
    .line 4
    sget-object v1, LA1/o;->p:LA1/o;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LA1/o;->q:LA1/o;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LA1/o;->r:LA1/o;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LA1/o;->s:LA1/o;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA1/o;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LA1/o;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, LA1/o;

    .line 13
    .line 14
    return-object p0
.end method

.method public static values()[LA1/o;
    .locals 2

    .line 1
    sget-object v0, LA1/o;->t:[LA1/o;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [LA1/o;

    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LA1/o;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
