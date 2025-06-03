.class public Landroidx/activity/result/ActivityResultRegistry$b;
.super Landroidx/activity/result/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/result/ActivityResultRegistry;->j(Ljava/lang/String;Ld/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld/a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/activity/result/ActivityResultRegistry;


# direct methods
.method public constructor <init>(Landroidx/activity/result/ActivityResultRegistry;ILd/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$b;->d:Landroidx/activity/result/ActivityResultRegistry;

    .line 2
    .line 3
    iput p2, p0, Landroidx/activity/result/ActivityResultRegistry$b;->a:I

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/activity/result/ActivityResultRegistry$b;->b:Ld/a;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/activity/result/ActivityResultRegistry$b;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/activity/result/c;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lw/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$b;->d:Landroidx/activity/result/ActivityResultRegistry;

    .line 2
    .line 3
    iget v1, p0, Landroidx/activity/result/ActivityResultRegistry$b;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/activity/result/ActivityResultRegistry$b;->b:Ld/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, p1, p2}, Landroidx/activity/result/ActivityResultRegistry;->f(ILd/a;Ljava/lang/Object;Lw/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$b;->d:Landroidx/activity/result/ActivityResultRegistry;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultRegistry;->l(Ljava/lang/String;)V

    return-void
.end method
