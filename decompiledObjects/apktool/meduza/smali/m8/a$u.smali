.class public final Lm8/a$u;
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
    name = "u"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$u;

.field public static final b:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$u;

    invoke-direct {v0}, Lm8/a$u;-><init>()V

    sput-object v0, Lm8/a$u;->a:Lm8/a$u;

    const-string v0, "content"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$u;->b:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lm8/f0$e$d$d;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$u;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
