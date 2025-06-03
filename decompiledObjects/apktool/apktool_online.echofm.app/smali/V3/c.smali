.class public abstract LV3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld4/b;

.field public static final b:Ld4/b;

.field public static final c:Ld4/b;

.field public static final d:Ld4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, ".info"

    .line 2
    .line 3
    invoke-static {v0}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LV3/c;->a:Ld4/b;

    .line 8
    .line 9
    const-string v0, "serverTimeOffset"

    .line 10
    .line 11
    invoke-static {v0}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LV3/c;->b:Ld4/b;

    .line 16
    .line 17
    const-string v0, "authenticated"

    .line 18
    .line 19
    invoke-static {v0}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LV3/c;->c:Ld4/b;

    .line 24
    .line 25
    const-string v0, "connected"

    .line 26
    .line 27
    invoke-static {v0}, Ld4/b;->j(Ljava/lang/String;)Ld4/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LV3/c;->d:Ld4/b;

    .line 32
    .line 33
    return-void
.end method
