.class public abstract Lwa/a;
.super Lm/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lm/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/Serializable;)V
    .locals 1

    invoke-virtual {p0}, Lwa/a;->v()Lwa/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lwa/d;->a(Ljava/io/Serializable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    invoke-virtual {p0}, Lwa/a;->v()Lwa/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwa/d;->b(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public abstract v()Lwa/d;
.end method
