.class public final Le0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/f$b;,
        Le0/f$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le0/g;

.field public final c:Le0/f$b;

.field public final d:Le0/f$a;

.field public e:Landroid/view/VelocityTracker;

.field public f:F

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/core/widget/NestedScrollView$c;)V
    .locals 3

    new-instance v0, Le0/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    new-instance v2, Le0/e;

    invoke-direct {v2, v1}, Le0/e;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, -0x1

    iput v1, p0, Le0/f;->g:I

    iput v1, p0, Le0/f;->h:I

    iput v1, p0, Le0/f;->i:I

    const/4 v1, 0x2

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, Le0/f;->j:[I

    iput-object p1, p0, Le0/f;->a:Landroid/content/Context;

    iput-object p2, p0, Le0/f;->b:Le0/g;

    iput-object v0, p0, Le0/f;->c:Le0/f$b;

    iput-object v2, p0, Le0/f;->d:Le0/f$a;

    return-void

    :array_0
    .array-data 4
        0x7fffffff
        0x0
    .end array-data
.end method
