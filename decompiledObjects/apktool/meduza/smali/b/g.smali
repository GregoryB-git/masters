.class public final synthetic Lb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb/j;


# direct methods
.method public synthetic constructor <init>(Lb/j;I)V
    .locals 0

    iput p2, p0, Lb/g;->a:I

    iput-object p1, p0, Lb/g;->b:Lb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget v0, p0, Lb/g;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lb/g;->b:Lb/j;

    invoke-static {v0, p1}, Lb/j;->b(Lb/j;Landroid/content/Context;)V

    return-void

    :goto_0
    iget-object v0, p0, Lb/g;->b:Lb/j;

    check-cast v0, Lx0/m;

    invoke-static {v0, p1}, Lx0/m;->f(Lx0/m;Landroid/content/Context;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
