.class public final Lm8/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$d;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;

.field public static final h:Ly8/c;

.field public static final i:Ly8/c;

.field public static final j:Ly8/c;

.field public static final k:Ly8/c;

.field public static final l:Ly8/c;

.field public static final m:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$d;

    invoke-direct {v0}, Lm8/a$d;-><init>()V

    sput-object v0, Lm8/a$d;->a:Lm8/a$d;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->b:Ly8/c;

    const-string v0, "gmpAppId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->c:Ly8/c;

    const-string v0, "platform"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->d:Ly8/c;

    const-string v0, "installationUuid"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->e:Ly8/c;

    const-string v0, "firebaseInstallationId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->f:Ly8/c;

    const-string v0, "firebaseAuthenticationToken"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->g:Ly8/c;

    const-string v0, "appQualitySessionId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->h:Ly8/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->i:Ly8/c;

    const-string v0, "displayVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->j:Ly8/c;

    const-string v0, "session"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->k:Ly8/c;

    const-string v0, "ndkPayload"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->l:Ly8/c;

    const-string v0, "appExitInfo"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$d;->m:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lm8/f0;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$d;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->j()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$d;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->h:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->i:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->j:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->k:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->l()Lm8/f0$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->l:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->i()Lm8/f0$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$d;->m:Ly8/c;

    invoke-virtual {p1}, Lm8/f0;->a()Lm8/f0$a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
