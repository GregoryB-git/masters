.class public final Lj3/b$h;
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
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lj3/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lj3/b$h;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;

.field public static final h:Ly8/c;

.field public static final i:Ly8/c;

.field public static final j:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b$h;

    invoke-direct {v0}, Lj3/b$h;-><init>()V

    sput-object v0, Lj3/b$h;->a:Lj3/b$h;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->b:Ly8/c;

    const-string v0, "eventCode"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->c:Ly8/c;

    const-string v0, "complianceData"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->d:Ly8/c;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->e:Ly8/c;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->f:Ly8/c;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->g:Ly8/c;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->h:Ly8/c;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->i:Ly8/c;

    const-string v0, "experimentIds"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$h;->j:Ly8/c;

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

    check-cast p1, Lj3/t;

    check-cast p2, Ly8/e;

    sget-object v0, Lj3/b$h;->b:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lj3/b$h;->c:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$h;->d:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->a()Lj3/p;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$h;->e:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lj3/b$h;->f:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->g()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$h;->g:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$h;->h:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lj3/b$h;->i:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->f()Lj3/w;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$h;->j:Ly8/c;

    invoke-virtual {p1}, Lj3/t;->e()Lj3/q;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
