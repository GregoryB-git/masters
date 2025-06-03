.class public final Lb0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lb0/l$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lb0/g;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb0/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lb0/h;->b:Landroid/content/Context;

    iput-object p3, p0, Lb0/h;->c:Lb0/g;

    iput p4, p0, Lb0/h;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lb0/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lb0/h;->b:Landroid/content/Context;

    iget-object v2, p0, Lb0/h;->c:Lb0/g;

    iget v3, p0, Lb0/h;->d:I

    invoke-static {v0, v1, v2, v3}, Lb0/l;->a(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)Lb0/l$a;

    move-result-object v0

    return-object v0
.end method
