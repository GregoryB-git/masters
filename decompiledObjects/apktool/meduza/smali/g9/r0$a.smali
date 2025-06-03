.class public final Lg9/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lj9/j;

.field public final b:Lg9/j;

.field public final c:Z

.field public final d:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/j;Lg9/j;Lt8/e;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/r0$a;->a:Lj9/j;

    iput-object p2, p0, Lg9/r0$a;->b:Lg9/j;

    iput-object p3, p0, Lg9/r0$a;->d:Lt8/e;

    iput-boolean p4, p0, Lg9/r0$a;->c:Z

    return-void
.end method
