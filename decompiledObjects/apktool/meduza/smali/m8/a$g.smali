.class public final Lm8/a$g;
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
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$g;

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

    new-instance v0, Lm8/a$g;

    invoke-direct {v0}, Lm8/a$g;-><init>()V

    sput-object v0, Lm8/a$g;->a:Lm8/a$g;

    const-string v0, "identifier"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->b:Ly8/c;

    const-string v0, "version"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->c:Ly8/c;

    const-string v0, "displayVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->d:Ly8/c;

    const-string v0, "organization"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->e:Ly8/c;

    const-string v0, "installationUuid"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->f:Ly8/c;

    const-string v0, "developmentPlatform"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->g:Ly8/c;

    const-string v0, "developmentPlatformVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$g;->h:Ly8/c;

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

    check-cast p1, Lm8/f0$e$a;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$g;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->f()Lm8/f0$e$a$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$g;->h:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
