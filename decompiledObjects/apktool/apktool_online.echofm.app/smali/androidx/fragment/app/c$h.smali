.class public Landroidx/fragment/app/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->x(Ljava/util/List;ZLandroidx/fragment/app/B$e;Landroidx/fragment/app/B$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroidx/fragment/app/y;

.field public final synthetic p:Landroid/view/View;

.field public final synthetic q:Landroid/graphics/Rect;

.field public final synthetic r:Landroidx/fragment/app/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;Landroidx/fragment/app/y;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$h;->r:Landroidx/fragment/app/c;

    iput-object p2, p0, Landroidx/fragment/app/c$h;->o:Landroidx/fragment/app/y;

    iput-object p3, p0, Landroidx/fragment/app/c$h;->p:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/c$h;->q:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/c$h;->o:Landroidx/fragment/app/y;

    iget-object v1, p0, Landroidx/fragment/app/c$h;->p:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/c$h;->q:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/y;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
