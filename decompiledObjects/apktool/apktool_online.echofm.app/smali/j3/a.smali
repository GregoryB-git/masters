.class public final Lj3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/a$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/lang/String; = "a"


# instance fields
.field public final a:Lc3/q;

.field public final b:Lc3/a;

.field public c:Lc3/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj3/a;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lj3/a$b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj3/d;

    invoke-static {p1}, Lj3/a$b;->a(Lj3/a$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lj3/a$b;->b(Lj3/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lj3/a$b;->c(Lj3/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lj3/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lj3/a;->a:Lc3/q;

    invoke-static {p1}, Lj3/a$b;->d(Lj3/a$b;)Lc3/a;

    move-result-object v0

    iput-object v0, p0, Lj3/a;->b:Lc3/a;

    invoke-static {p1}, Lj3/a$b;->e(Lj3/a$b;)Lc3/o;

    move-result-object p1

    iput-object p1, p0, Lj3/a;->c:Lc3/o;

    return-void
.end method

.method public synthetic constructor <init>(Lj3/a$b;Lj3/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lj3/a;-><init>(Lj3/a$b;)V

    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lj3/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Z
    .locals 1

    .line 1
    invoke-static {}, Lj3/a;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lj3/a;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method


# virtual methods
.method public declared-synchronized d()Lc3/n;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lj3/a;->c:Lc3/o;

    .line 3
    .line 4
    invoke-virtual {v0}, Lc3/o;->d()Lc3/n;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
.end method
