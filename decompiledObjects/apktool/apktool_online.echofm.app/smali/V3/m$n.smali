.class public LV3/m$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->E(Ljava/util/List;LY3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$n;->b:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$n;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LY3/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/m$n;->b:LV3/m;

    .line 2
    .line 3
    iget-object v1, p0, LV3/m$n;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LV3/m;->u(LV3/m;Ljava/util/List;LY3/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
