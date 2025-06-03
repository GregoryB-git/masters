.class public LV3/m$u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m$u;->b(La4/i;LV3/y;LT3/g;LV3/x$p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/x$p;

.field public final synthetic b:LV3/m$u;


# direct methods
.method public constructor <init>(LV3/m$u;LV3/x$p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$u$a;->b:LV3/m$u;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$u$a;->a:LV3/x$p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LV3/m;->y(Ljava/lang/String;Ljava/lang/String;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LV3/m$u$a;->a:LV3/x$p;

    .line 6
    .line 7
    invoke-interface {p2, p1}, LV3/x$p;->a(LQ3/c;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, LV3/m$u$a;->b:LV3/m$u;

    .line 12
    .line 13
    iget-object p2, p2, LV3/m$u;->a:LV3/m;

    .line 14
    .line 15
    invoke-static {p2, p1}, LV3/m;->x(LV3/m;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
