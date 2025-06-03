.class public Lu5/D$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu5/D;


# direct methods
.method public constructor <init>(Lu5/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/D$d;->a:Lu5/D;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/window/layout/WindowLayoutInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D$d;->a:Lu5/D;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu5/D;->setWindowInfoListenerDisplayFeatures(Landroidx/window/layout/WindowLayoutInfo;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/window/layout/WindowLayoutInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu5/D$d;->a(Landroidx/window/layout/WindowLayoutInfo;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
