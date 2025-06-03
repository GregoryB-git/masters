.class public LX3/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX3/g;->b(Ljava/lang/Object;LY3/d$c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LY3/d$c;

.field public final synthetic b:LX3/g;


# direct methods
.method public constructor <init>(LX3/g;LY3/d$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX3/g$c;->b:LX3/g;

    .line 2
    .line 3
    iput-object p2, p0, LX3/g$c;->a:LY3/d$c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LV3/k;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LX3/g$c;->b(LV3/k;Ljava/lang/Boolean;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(LV3/k;Ljava/lang/Boolean;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, LX3/g$c;->a:LY3/d$c;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-interface {p2, p1, v0, p3}, LY3/d$c;->a(LV3/k;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object p3
.end method
