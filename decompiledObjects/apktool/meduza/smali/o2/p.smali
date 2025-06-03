.class public abstract Lo2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo2/q;)Lo2/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo2/p;->b(Ljava/util/List;)Lp2/o;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Ljava/util/List;)Lp2/o;
.end method
