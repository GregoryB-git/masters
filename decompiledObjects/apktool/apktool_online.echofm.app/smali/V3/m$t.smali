.class public LV3/m$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/x$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$t;->a:LV3/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La4/i;LV3/y;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(La4/i;LV3/y;LT3/g;LV3/x$p;)V
    .locals 0

    .line 1
    iget-object p2, p0, LV3/m$t;->a:LV3/m;

    .line 2
    .line 3
    new-instance p3, LV3/m$t$a;

    .line 4
    .line 5
    invoke-direct {p3, p0, p1, p4}, LV3/m$t$a;-><init>(LV3/m$t;La4/i;LV3/x$p;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p3}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
