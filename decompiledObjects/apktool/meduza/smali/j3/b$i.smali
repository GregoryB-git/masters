.class public final Lj3/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lj3/u;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lj3/b$i;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;

.field public static final h:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b$i;

    invoke-direct {v0}, Lj3/b$i;-><init>()V

    sput-object v0, Lj3/b$i;->a:Lj3/b$i;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->b:Ly8/c;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->c:Ly8/c;

    const-string v0, "clientInfo"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->d:Ly8/c;

    const-string v0, "logSource"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->e:Ly8/c;

    const-string v0, "logSourceName"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->f:Ly8/c;

    const-string v0, "logEvent"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->g:Ly8/c;

    const-string v0, "qosTier"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$i;->h:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lj3/u;

    check-cast p2, Ly8/e;

    sget-object v0, Lj3/b$i;->b:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lj3/b$i;->c:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lj3/b$i;->d:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->a()Lj3/o;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$i;->e:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$i;->f:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$i;->g:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$i;->h:Ly8/c;

    invoke-virtual {p1}, Lj3/u;->e()Lj3/x;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
