.class public Landroidx/versionedparcelable/ParcelImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lb2/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/versionedparcelable/ParcelImpl$a;

    invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$a;-><init>()V

    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb2/d;

    invoke-direct {v0, p1}, Lb2/d;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, Lb2/c;->w()Lb2/e;

    move-result-object p1

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->a:Lb2/e;

    return-void
.end method

.method public constructor <init>(Lb2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->a:Lb2/e;

    return-void
.end method


# virtual methods
.method public a()Lb2/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lb2/e;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/versionedparcelable/ParcelImpl;->a:Lb2/e;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    new-instance p2, Lb2/d;

    invoke-direct {p2, p1}, Lb2/d;-><init>(Landroid/os/Parcel;)V

    iget-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->a:Lb2/e;

    invoke-virtual {p2, p1}, Lb2/c;->Q(Lb2/e;)V

    return-void
.end method
