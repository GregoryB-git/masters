.class public abstract Lkotlin/jvm/internal/n;
.super Lkotlin/jvm/internal/r;
.source "SourceFile"

# interfaces
.implements Lm6/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lm6/b;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/v;->d(Lkotlin/jvm/internal/n;)Lm6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lm6/f;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
