.class public LV3/F$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LV3/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LV3/F$b;->b(LV3/B;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LV3/B;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, LV3/B;->f()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
