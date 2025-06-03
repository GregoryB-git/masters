.class public LV3/m$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->g(LV3/k;I)LV3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$p;->b:LV3/m;

    .line 2
    .line 3
    iput p2, p0, LV3/m$p;->a:I

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
    iget-object v0, p0, LV3/m$p;->b:LV3/m;

    .line 2
    .line 3
    iget v1, p0, LV3/m$p;->a:I

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, LV3/m;->v(LV3/m;LY3/k;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
