.class public LY3/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY3/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:LY3/d;


# direct methods
.method public constructor <init>(LY3/d;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY3/d$b;->b:LY3/d;

    .line 2
    .line 3
    iput-object p2, p0, LY3/d$b;->a:Ljava/util/List;

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
    check-cast p3, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LY3/d$b;->b(LV3/k;Ljava/lang/Object;Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(LV3/k;Ljava/lang/Object;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .line 1
    iget-object p3, p0, LY3/d$b;->a:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method
