.class public LF/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->e(Landroid/content/Context;LF/e;LF/a;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:LF/e;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;LF/e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/f$a;->o:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LF/f$a;->p:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, LF/f$a;->q:LF/e;

    .line 6
    .line 7
    iput p4, p0, LF/f$a;->r:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LF/f$e;
    .locals 4

    .line 1
    iget-object v0, p0, LF/f$a;->o:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LF/f$a;->p:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LF/f$a;->q:LF/e;

    .line 6
    .line 7
    iget v3, p0, LF/f$a;->r:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LF/f;->c(Ljava/lang/String;Landroid/content/Context;LF/e;I)LF/f$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF/f$a;->a()LF/f$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
