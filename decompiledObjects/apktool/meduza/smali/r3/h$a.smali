.class public final Lr3/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lr3/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/h;

    invoke-direct {v0}, Lr3/h;-><init>()V

    sput-object v0, Lr3/h$a;->a:Lr3/h;

    return-void
.end method
