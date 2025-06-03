.class public final Lm6/s;
.super Lm6/t;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Ll6/g;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Ll6/g;)V
    .locals 0

    iput-object p1, p0, Lm6/s;->a:Landroid/content/Intent;

    iput-object p2, p0, Lm6/s;->b:Ll6/g;

    invoke-direct {p0}, Lm6/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lm6/s;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lm6/s;->b:Ll6/g;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Ll6/g;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
