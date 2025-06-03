.class public final La4/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:La4/g;


# direct methods
.method public constructor <init>(Landroid/os/Handler;La4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/g$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, La4/g$a$a;->b:La4/g;

    return-void
.end method
