.class public LL5/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL5/C;->c(Ljava/util/Map;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LL5/C;


# direct methods
.method public constructor <init>(LL5/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL5/C$a;->a:LL5/C;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LL5/C$a;->a:LL5/C;

    .line 2
    .line 3
    invoke-static {v0}, LL5/C;->b(LL5/C;)LV2/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LV2/k;->c(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const-string p2, "An unknown error occurred"

    .line 9
    .line 10
    :cond_0
    instance-of v1, p3, Ljava/util/Map;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move-object v0, p3

    .line 15
    check-cast v0, Ljava/util/Map;

    .line 16
    .line 17
    :cond_1
    new-instance p3, LL5/y;

    .line 18
    .line 19
    invoke-direct {p3, p1, p2, v0}, LL5/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LL5/C$a;->a:LL5/C;

    .line 23
    .line 24
    invoke-static {p1}, LL5/C;->b(LL5/C;)LV2/k;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, p3}, LV2/k;->b(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method
