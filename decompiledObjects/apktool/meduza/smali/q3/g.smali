.class public final synthetic Lq3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/b$a;


# instance fields
.field public final synthetic a:Lq3/k;

.field public final synthetic b:Lk3/s;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lq3/k;Lk3/s;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/g;->a:Lq3/k;

    iput-object p2, p0, Lq3/g;->b:Lk3/s;

    iput p3, p0, Lq3/g;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lq3/g;->a:Lq3/k;

    iget-object v1, p0, Lq3/g;->b:Lk3/s;

    iget v2, p0, Lq3/g;->c:I

    iget-object v0, v0, Lq3/k;->d:Lq3/n;

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v1, v2}, Lq3/n;->b(Lk3/s;I)V

    const/4 v0, 0x0

    return-object v0
.end method
