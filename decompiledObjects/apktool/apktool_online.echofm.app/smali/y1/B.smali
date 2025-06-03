.class public final Ly1/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly1/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ly1/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/B;->a:Ly1/B;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 2

    .line 1
    const-class v0, Ly1/B;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v1, LO1/v;->a:LO1/v;

    .line 11
    .line 12
    new-instance v1, Ly1/B$a;

    .line 13
    .line 14
    invoke-direct {v1}, Ly1/B$a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, LO1/v;->d(LO1/v$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
