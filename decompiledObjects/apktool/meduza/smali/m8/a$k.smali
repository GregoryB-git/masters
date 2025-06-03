.class public final Lm8/a$k;
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
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$k;

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

    new-instance v0, Lm8/a$k;

    invoke-direct {v0}, Lm8/a$k;-><init>()V

    sput-object v0, Lm8/a$k;->a:Lm8/a$k;

    const-string v0, "execution"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->b:Ly8/c;

    const-string v0, "customAttributes"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->c:Ly8/c;

    const-string v0, "internalKeys"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->d:Ly8/c;

    const-string v0, "background"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->e:Ly8/c;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->f:Ly8/c;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->g:Ly8/c;

    const-string v0, "uiOrientation"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$k;->h:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$a;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$k;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->e()Lm8/f0$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->c()Lm8/f0$e$d$a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$k;->h:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a;->g()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    return-void
.end method
