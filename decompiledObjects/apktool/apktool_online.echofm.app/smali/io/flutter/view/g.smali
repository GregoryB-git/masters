.class public final synthetic Lio/flutter/view/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/e;


# instance fields
.field public final synthetic a:Lio/flutter/view/i$l;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/view/i$l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/view/g;->a:Lio/flutter/view/i$l;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/view/g;->a:Lio/flutter/view/i$l;

    check-cast p1, Lio/flutter/view/i$l;

    invoke-static {v0, p1}, Lio/flutter/view/i;->a(Lio/flutter/view/i$l;Lio/flutter/view/i$l;)Z

    move-result p1

    return p1
.end method
