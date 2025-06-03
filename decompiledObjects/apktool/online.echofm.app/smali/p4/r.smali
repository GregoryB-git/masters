.class public final synthetic Lp4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final a:Lcom/google/firebase/iid/a;

.field public final b:Landroid/util/Pair;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/a;Landroid/util/Pair;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/r;->a:Lcom/google/firebase/iid/a;

    .line 5
    .line 6
    iput-object p2, p0, Lp4/r;->b:Landroid/util/Pair;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LV2/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp4/r;->a:Lcom/google/firebase/iid/a;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/r;->b:Landroid/util/Pair;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/iid/a;->b(Landroid/util/Pair;LV2/j;)LV2/j;

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
