.class public final Lv5/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/util/SparseBooleanArray;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lv5/h$a;->a:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-boolean v0, p0, Lv5/h$a;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iget-object v0, p0, Lv5/h$a;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    return-void
.end method

.method public final b()Lv5/h;
    .locals 2

    iget-boolean v0, p0, Lv5/h$a;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lx6/b;->H(Z)V

    iput-boolean v1, p0, Lv5/h$a;->b:Z

    new-instance v0, Lv5/h;

    iget-object v1, p0, Lv5/h$a;->a:Landroid/util/SparseBooleanArray;

    invoke-direct {v0, v1}, Lv5/h;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method
